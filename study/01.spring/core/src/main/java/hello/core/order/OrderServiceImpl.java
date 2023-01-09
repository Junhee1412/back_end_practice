package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor //final이 붙은 필드로 생성자를 만들어줌.
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
//  private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy;

    //생성자 주입을 하면 필드에 final이라는 속성을 부여할 수 있음. Test에서 오류가 난다 알려줌<< final
    //생성자 주입을 사용하면 final키워드 사용가능, 불변, 누락을 방지할 수 있다는 장점으로 인해 생성자 주입을 사용해야함.
    //가끔 옵션이 필요하면 수정자 주입을 선택해라 필드 주입은 사용하지말자

    //@RequiredArgsConstructor로 해결
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

//    @Autowired//일반 메서드 주입 잘 사용하지 않음. 스프링 빈 안에서만 오토와이어로 메서드를 주입할 수 있다.
//    public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy){
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
