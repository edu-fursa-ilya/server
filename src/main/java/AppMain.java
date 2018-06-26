import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AppMain {

    public static void main(String[] args) throws Exception {
        FrontendServlet frontendServlet = new FrontendServlet();

        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(handler);
        handler.addServlet(new ServletHolder(frontendServlet), "/authform");

        server.start();
        server.join();
    }
}
