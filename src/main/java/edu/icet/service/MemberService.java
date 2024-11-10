package edu.icet.service;

import edu.icet.dto.Member;
import edu.icet.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    void addMember(Member member);
    List<Member> getAll();
    void deleteMemberById(Integer id);
    void updateMemberById(Member member);
}
