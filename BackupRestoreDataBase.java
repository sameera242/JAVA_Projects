import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/BackupRestoreDataBase")
public class BackupRestoreDataBase extends HttpServlet {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     if(request.getParameter("backup")!=null){
                 String status=DBBackup.mysqlDatabaseBackUp();
                        if(status.equals("y")){
                                 HttpSession session=request.getSession(true);
                                 session.setAttribute("currentSessionUser", "");
                                 response.sendRedirect("backupsuccess.jsp");
                        }
                        else{

                        response.sendRedirect("backupsuccess.jsp");
                        }   
     }
                        else if(request.getParameter("restore")!=null){

                        	String fileName=request.getParameter("file");
                        	boolean status1=DBBackup. mysqlDatabaseRestore("dbName","dbUserName","dbPassword","C:\\folderName\\"+fileName);
                  if(status1==true){
                      System.out.println("restore success ");
                       HttpSession session=request.getSession(true);
                          session.setAttribute("currentSessionUser", "");
                            response.sendRedirect("restoresuccess.jsp");
                  }
                  else{
                          System.out.println("restore failure ");
                     response.sendRedirect("restoresuccess.jsp");
                  }

                 }
    }
}

