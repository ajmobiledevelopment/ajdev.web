package ajdev.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ajdev.web.vo.ResponseObject;

@RestController
public class Main {
	
	@RequestMapping("/index")
    public ResponseObject index(
    		javax.servlet.http.HttpServletRequest request, 
    		javax.servlet.http.HttpServletResponse response,
            @RequestParam(value="param") String param 
            ) {
        return new ResponseObject( request  );
    }

}
