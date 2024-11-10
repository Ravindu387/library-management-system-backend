package edu.icet.controller;

import edu.icet.dto.Member;
import edu.icet.dto.User;
import edu.icet.entity.MemberEntity;
import edu.icet.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {

    @Autowired
    private final MemberService service;

    @PostMapping("/add-member")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMember(@RequestBody Member member){
        service.addMember(member);
        System.out.println(member);
    }

    @GetMapping("/get-all")
    public List<Member> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteMemberById(@PathVariable Integer id){
        service.deleteMemberById(id);
    }

    @PutMapping("/update-member")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Member member){
        service.updateMemberById(member);
    }
}
