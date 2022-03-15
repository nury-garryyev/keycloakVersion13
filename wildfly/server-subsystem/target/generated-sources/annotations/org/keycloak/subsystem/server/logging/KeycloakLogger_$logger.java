package org.keycloak.subsystem.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2022-03-15T06:29:45+0500")
public class KeycloakLogger_$logger extends DelegatingBasicLogger implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = KeycloakLogger_$logger.class.getName();
    public KeycloakLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
