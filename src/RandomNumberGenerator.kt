import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator() {
    private var number : Int = 0                     // 現在の数
    override fun getNumber() :Int {                // 数を取得する
        return number
    }
    override fun execute() {
        for (i in 1..20) {
            number = Random.nextInt(50)
            super.notifyObservers()
        }
    }
}
