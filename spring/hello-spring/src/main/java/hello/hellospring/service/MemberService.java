package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } //직접 인스턴스를 생성하는게 아니라, 생성자로.

    /**
     *  회원 가입
     */
    public Long join(Member member){
            validateDuplicateMember(member);
            memberRepository.save(member);
            return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미존재");
                });
    }

    /**
     *  전체 회원 조회
     */
    public List<Member> findMembers() {
            return memberRepository.findAll();

    }
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

    
