package mkl.testarea.signature.misc;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

import org.junit.BeforeClass;
import org.junit.Test;
/**
 * @author mkl
 */
public class CertificateInformation {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * <a href="https://stackoverflow.com/questions/60261855/cant-pars-subjectalternativenames-in-java">
     * Can't pars subjectAlternativeNames in java
     * </a>
     * <br/>
     * <a href="https://ct.googleapis.com/rocketeer/ct/v1/get-entries?start=32621134&end=32621134">
     * json "extra_data"
     * </a>, inlined
     * <p>
     * Cannot reproduce the issue, already the {@link CertificateFactory#generateCertificate(java.io.InputStream)}
     * call fails.
     * </p>
     */
    @Test
    public void testAntonsCertificate() throws CertificateException {
        String extraDataBase64 = "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";
        byte[] extraData = Base64.getDecoder().decode(extraDataBase64);

        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        Certificate certificate = certFactory.generateCertificate(new ByteArrayInputStream(extraData));

        X509Certificate x509Certificate = (X509Certificate) certificate;
    }

}
