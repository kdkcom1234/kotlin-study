package accountManager.kotlin

class Account()

object AccountManager {
    val accountList = mutableListOf<Account>()
    fun run() {
        while(true) {
            try {
                when(readln().toInt()) {
                    0 -> { /* 종료 */ }
                    1 -> { /* 1번 로직 */ }
                    else -> {
                        println("메뉴 번호제대로입력")
                        continue
                    }
                }
            } catch (e : NumberFormatException) {
                println("숫자를 입력해주세요")
                continue
            }
        }


        //....
        // 추가적으로 5번에 계좌이체를 해보세요.
        // 보낼계좌(from), 받는계좌(to), 보낼금액(amount)

        // 로직:
        // from의 balance를 amount만큼 감소,
        // to의 balance를 amount만큼 증가
    }
}