import javax.servlet.http.{HttpServlet,
HttpServletRequest => HSReq, HttpServletResponse => HSResp}

class HelloScalaServlet extends HttpServlet
{
  def message =
    <HTML>
    <HEAD> <TITLE>Hello, Scala!</TITLE> </HEAD>
    <BODY>Hello, Scala! It's now{currentDate}</BODY>
    </HTML>

  def currentDate = java.util.Calendar.getInstance().getTime()

  override def doGet(req: HSReq, resp: HSResp) =
    resp.getWriter().print(message)
}
