module wiremock.slf4j.shim.main {
    exports wiremock.org.slf4j.spi;
    exports wiremock.org.slf4j.helpers;

    requires org.slf4j;

    provides org.slf4j.spi.SLF4JServiceProvider
            with wiremock.org.slf4j.helpers.NOP_FallbackServiceProvider;
}