package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1F4  reason: invalid class name */
public class AnonymousClass1F4 {
    public static final Map A00 = Collections.synchronizedMap(new HashMap());
    public static final Set A01;
    public static final Logger A02 = Logger.getLogger(AnonymousClass1F4.class.getName());

    static {
        HashSet hashSet = new HashSet(8);
        hashSet.add(43);
        hashSet.add(44);
        hashSet.add(49);
        hashSet.add(55);
        hashSet.add(61);
        hashSet.add(81);
        A01 = hashSet;
    }

    public static void A00(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                A02.log(Level.WARNING, e.toString());
            }
        }
    }
}
