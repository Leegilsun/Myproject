package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload2.do")
public class MultiUploadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");

		PrintWriter pw = resp.getWriter();
		String savePath = "upload";
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String enctype = "utf-8";

		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);

		try {
			MultipartRequest multi = new MultipartRequest(req, uploadFilePath, uploadFileSizeLimit, enctype,
					new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames();
			while (files.hasMoreElements()) {
				String file = (String) files.nextElement();
				String file_name = multi.getFilesystemName(file);
				String ori_file_name = multi.getOriginalFileName(file);
				pw.println("<br>업로드된 파일명 : " + file_name);
				pw.println("<br>원본 파일명 : " + ori_file_name);
				pw.println("<img src='upload/"+ file_name+"'>");
				pw.println("<hr>");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
