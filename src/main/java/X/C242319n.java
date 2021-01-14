package X;

import java.io.PrintStream;

/* renamed from: X.19n  reason: invalid class name and case insensitive filesystem */
public final class C242319n {
    public static final AbstractC242219m A00;

    static {
        AbstractC242219m r0;
        try {
            Integer num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            if (num != null) {
                try {
                    if (num.intValue() >= 19) {
                        r0 = new C35661kj();
                        A00 = r0;
                    }
                } catch (Throwable th) {
                    PrintStream printStream = System.err;
                    String name = C35641kh.class.getName();
                    StringBuilder sb = new StringBuilder(name.length() + 133);
                    sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb.append(name);
                    sb.append("will be used. The error is: ");
                    printStream.println(sb.toString());
                    th.printStackTrace(printStream);
                    r0 = new C35641kh();
                }
            }
        } catch (Exception e) {
            PrintStream printStream2 = System.err;
            printStream2.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream2);
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new C35651ki();
        } else {
            r0 = new C35641kh();
        }
        A00 = r0;
    }
}
