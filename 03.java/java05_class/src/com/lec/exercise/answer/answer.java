/*

1. 3
2. 4
3. 4
4. 3
5. 1
6. 4
7. 2
8. 2
9. 2
10. 4
11. 3
12. 필드, 생성자, 메서드
13. 
public class Member{
	public String name;
	public String id;
	public String password;
	public int age;
}
14. 
public class Member{
	public String name;
	public String id;
	public String password;
	public int age;
	
	Member(String name, String id){
	this.name = name;
	this.id = id;
	}
}
15. 
public class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
}
class MemberService{
	public boolean login(String id, String password) {
		
		if(id =="hong") {
			if(password=="12345") {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

16. 
public class Printer {
	public void println(int i) {
		
	}
	
	public void println(double d) {
		
	}

	public void println(boolean b) {
		
	}

	public void println(String string) {
		
	}
}
17. 
public class Printer {
	static void println(int i) {
		
	}
	
	static void println(double d) {
		
	}

	static void println(boolean b) {
		
	}

	static void println(String string) {
		
	}
}
18. 
public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}

19. 

public class Account {
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	
	private int balance = 0;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE ) {
			this.balance = balance;
		}
	}
	public int getBalance() {
		return this.balance;
	}
}

*/
