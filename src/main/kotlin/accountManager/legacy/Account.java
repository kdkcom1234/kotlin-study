package accountManager.legacy;

// 계좌 클래스
public class Account {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // 계좌 객체에 잔액 증가
    public void deposit(double amount) {
        // **코드 작성
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        this.balance += amount;
    }

    // 계좌 객체에 잔액 차감
    public void withdraw(double amount) {
        // **코드 작성
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if(this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("--잔액이 부족합니다.!!--");
        }
    }
}