package com.whatsapp.jobqueue.requirement;

import X.AbstractC002201f;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass0EA;
import X.AnonymousClass0Ja;
import X.C04110Jc;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Locale;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class HsmMessagePackRequirement implements AnonymousClass0EA, Requirement {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0Ja A00;
    public final String elementName;
    public Locale[] locales;
    public final String namespace;

    public HsmMessagePackRequirement(Locale[] localeArr, String str, String str2) {
        if (localeArr != null) {
            this.locales = localeArr;
            AnonymousClass00E.A03(str);
            this.namespace = str;
            AnonymousClass00E.A03(str2);
            this.elementName = str2;
            return;
        }
        throw null;
    }

    public boolean A00() {
        C04110Jc A03 = this.A00.A03(this.locales, this.namespace);
        return (A03 == null || A03.A02.size() <= 0 || AnonymousClass0Ja.A01(A03, this.elementName) == null) ? false : true;
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean ABQ() {
        Long l;
        AnonymousClass0Ja r1 = this.A00;
        Locale[] localeArr = this.locales;
        String str = this.namespace;
        synchronized (r1.A03) {
            l = (Long) r1.A04.get(Pair.create(localeArr, str));
        }
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0 && System.currentTimeMillis() - longValue < 3600000) {
                StringBuilder A0S = AnonymousClass008.A0S("satisfying hsm pack requirement due to recent response");
                StringBuilder A0S2 = AnonymousClass008.A0S("; locales=");
                A0S2.append(AbstractC002201f.A08(this.locales));
                A0S2.append("; namespace=");
                A0S2.append(this.namespace);
                A0S.append(A0S2.toString());
                Log.i(A0S.toString());
                return true;
            }
        }
        return A00();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass0Ja.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr == null || localeArr.length == 0) {
            throw new InvalidObjectException("locales[] must not be empty");
        } else if (TextUtils.isEmpty(this.namespace)) {
            throw new InvalidObjectException("namespace must not be empty");
        } else if (TextUtils.isEmpty(this.elementName)) {
            throw new InvalidObjectException("elementName must not be empty");
        }
    }
}
