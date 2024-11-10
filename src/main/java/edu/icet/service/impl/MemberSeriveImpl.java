package edu.icet.service.impl;

import edu.icet.dto.Member;
import edu.icet.entity.MemberEntity;
import edu.icet.repository.MemberRepository;
import edu.icet.repository.UserRepository;
import edu.icet.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberSeriveImpl implements MemberService {

    private final MemberRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addMember(Member member) {
        repository.save(mapper.map(member , MemberEntity.class));
    }

    @Override
    public List<Member> getAll() {
        List<Member> memberArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            memberArrayList.add(mapper.map(entity, Member.class));
        });
        return memberArrayList;
    }
    @Override
    public void deleteMemberById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateMemberById(Member member) {
        repository.save(mapper.map(member , MemberEntity.class));
    }
}
