import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ProductService service;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        service = new ProductService();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String view = "";

        if (request.getParameter("action") == null) {
            getServletContext().getRequestDispatcher("/products?action=list").forward(request, response);
        } else {
            switch (action) {
                case "list": view = list(request, response); break;
                case "info": view = info(request, response); break;
            }
            getServletContext().getRequestDispatcher("/ch05/" + view).forward(request, response);
        }
    }

    private String list(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("products", service.findAll());
        return "productList.jsp";
    }

    private String info(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("p", service.find(request.getParameter("id")));
        return "productInfo.jsp";
    }
}
