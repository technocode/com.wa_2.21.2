package X;

import android.content.Context;
import android.content.pm.FeatureInfo;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.22V  reason: invalid class name */
public final class AnonymousClass22V extends AbstractC29021Ws {
    public static Pattern A01;
    public float A00 = -1.0f;

    public final float A03(Context context) {
        float f = this.A00;
        if (f >= 0.0f) {
            return f;
        }
        this.A00 = 0.0f;
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        int length = systemAvailableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            try {
                String str = systemAvailableFeatures[i].name;
                if (str != null && str.startsWith("com.htc.software.Sense")) {
                    Pattern pattern = A01;
                    if (pattern == null) {
                        pattern = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
                        A01 = pattern;
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        Float valueOf = Float.valueOf(Float.parseFloat(matcher.group(1)));
                        if (valueOf != null) {
                            this.A00 = valueOf.floatValue();
                            break;
                        }
                    } else {
                        throw new NumberFormatException("could not find version");
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i++;
        }
        StringBuilder A0S = AnonymousClass008.A0S("badger/htc/sense ");
        A0S.append(this.A00);
        Log.i(A0S.toString());
        return this.A00;
    }
}
