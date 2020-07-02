class GraphObserver :Observer {
    override fun update(generator:NumberGenerator) {
        System.out.println("GraphObserver:")
        var count = generator.getNumber()
        for (i in 0 until count) {
            System.out.print("*")
        }
        System.out.println("")
        try {
            Thread.sleep(100)
        } catch (e : Exception) {
        }
    }
}
