package xyz.silencelurker.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import xyz.silencelurker.test.service.IAdminService;

@RequestMapping("/admin/api")
@RestController
/**
 * @author Silence_Lurker
 */
public class AdminController {
    @Resource
    private IAdminService adminService;

    @GetMapping("/connection/test")
    public ResponseEntity<Void> test() {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
