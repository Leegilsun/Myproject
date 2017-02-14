package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();

		// 경로
		String savePath = "upload";
		// 파일 최대크기
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String encType = "utf-8";

		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println("서버상의 실제디렉토리 :");
		System.out.println(uploadFilePath);

		try {
			MultipartRequest multi = new MultipartRequest(req, uploadFilePath, uploadFileSizeLimit, encType,
					new DefaultFileRenamePolicy());
			String fileName = multi.getFilesystemName("uploadFile");

			if (fileName == null) {
				System.out.println("파일 업로드 안됨");
			} else {
				pw.println("<br>글쓴이 : " + multi.getParameter("name"));
				pw.println("<br>제 &nbsp;목 : " + multi.getParameter("title"));
				pw.println("<br>파일명 : " + fileName);
				pw.println("<img src='upload/"+fileName+"'>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
