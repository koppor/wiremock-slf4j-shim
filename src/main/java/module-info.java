module wiremock.slf4j.shim {
    exports wiremock.org.slf4j.helpers;

    requires org.slf4j;
    requires wiremock.slf4j.spi.shim;

    provides wiremock.org.slf4j.spi.SLF4JServiceProvider
            with wiremock.org.slf4j.helpers.NOP_FallbackServiceProvider;
}
