class DigitObserver :Observer {
    override fun update(generator: NumberGenerator) {
        System.out.println("DigitObserver:" + generator.getNumber())
        try {
            Thread.sleep(100);
        } catch (e: Exception) {
        }
    }
}
