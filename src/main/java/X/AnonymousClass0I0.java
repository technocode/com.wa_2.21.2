package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0I0  reason: invalid class name */
public class AnonymousClass0I0 {
    public int A00 = 0;
    public boolean A01;
    public final EnumC03840Hy A02;
    public final List A03 = new ArrayList();
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public AnonymousClass0I0(AnonymousClass0Hz r3) {
        this.A02 = r3.A07;
        this.A01 = r3.A04;
        this.A07 = r3.A05;
        this.A08 = r3.A06;
        this.A06 = r3.A03;
        this.A04 = r3.A01;
        this.A05 = r3.A02;
        AnonymousClass0RB r1 = r3.A00;
        this.A0A = r1.A01;
        this.A0D = r1.A04;
        this.A0E = r1.A05;
        this.A09 = r1.A00;
        this.A0B = r1.A02;
        this.A0C = r1.A03;
    }

    public static AnonymousClass0I0 A00(String str) {
        EnumC03840Hy r3;
        JSONObject jSONObject = new JSONObject(str);
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("sync_jid_hash")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sync_jid_hash");
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Base64.decode((String) jSONArray.get(i), 0));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("sync_jid")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("sync_jid");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                UserJid nullable = UserJid.getNullable((String) jSONArray2.get(i2));
                if (nullable != null) {
                    arrayList2.add(nullable);
                }
            }
        }
        int i3 = jSONObject.getInt("sync_type_code");
        EnumC03840Hy[] values = EnumC03840Hy.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                r3 = null;
                break;
            }
            r3 = values[i4];
            if (r3.code == i3) {
                break;
            }
            i4++;
        }
        AnonymousClass0Hz r2 = new AnonymousClass0Hz(r3);
        r2.A04 = jSONObject.getBoolean("sync_is_urgent");
        r2.A05 = jSONObject.getBoolean("sync_only_if_changed");
        r2.A06 = jSONObject.getBoolean("sync_only_if_registered");
        r2.A03 = jSONObject.getBoolean("sync_clear_whatsapp_sync_data");
        boolean optBoolean = jSONObject.optBoolean("sync_contact", true);
        boolean optBoolean2 = jSONObject.optBoolean("sync_sidelist", true);
        boolean optBoolean3 = jSONObject.optBoolean("sync_status", true);
        jSONObject.optBoolean("sync_picture", true);
        r2.A00 = new AnonymousClass0RB(optBoolean, optBoolean2, optBoolean3, jSONObject.optBoolean("sync_business", true), jSONObject.optBoolean("sync_devices", true), jSONObject.optBoolean("sync_payment", true));
        AnonymousClass0Hz.A00(r2, arrayList);
        r2.A02.addAll(arrayList2);
        AnonymousClass0I0 A012 = r2.A01();
        A012.A00 = jSONObject.getInt("sync_retry_count");
        if (jSONObject.getBoolean("sync_should_retry")) {
            A012.A03.add(new AnonymousClass0RC(true));
        }
        return A012;
    }

    public String A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sync_type_code", this.A02.code);
        jSONObject.put("sync_is_urgent", this.A01);
        jSONObject.put("sync_only_if_changed", this.A07);
        jSONObject.put("sync_only_if_registered", this.A08);
        jSONObject.put("sync_clear_whatsapp_sync_data", this.A06);
        jSONObject.put("sync_should_retry", A02());
        jSONObject.put("sync_retry_count", this.A00);
        jSONObject.put("sync_contact", this.A0A);
        jSONObject.put("sync_sidelist", this.A0D);
        jSONObject.put("sync_status", this.A0E);
        jSONObject.put("sync_picture", false);
        List<byte[]> list = this.A04;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (byte[] bArr : list) {
                arrayList.add(Base64.encodeToString(bArr, 0));
            }
            jSONObject.put("sync_jid_hash", new JSONArray((Collection) arrayList));
        }
        Set<Jid> set = this.A05;
        if (!set.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Jid jid : set) {
                arrayList2.add(jid.getRawString());
            }
            jSONObject.put("sync_jid", new JSONArray((Collection) arrayList2));
        }
        return jSONObject.toString();
    }

    public boolean A02() {
        for (AnonymousClass0RC r0 : this.A03) {
            if (r0.A00) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder A0S = AnonymousClass008.A0S("SyncRequest, mode=");
        EnumC03840Hy r1 = this.A02;
        A0S.append(r1.mode.modeString);
        A0S.append(", context=");
        A0S.append(r1.context.contextString);
        A0S.append(", protocols=");
        String str6 = "";
        if (this.A0A) {
            str = "C";
        } else {
            str = str6;
        }
        A0S.append(str);
        if (this.A0D) {
            str2 = "I";
        } else {
            str2 = str6;
        }
        A0S.append(str2);
        if (this.A0E) {
            str3 = "S";
        } else {
            str3 = str6;
        }
        A0S.append(str3);
        if (this.A09) {
            str4 = "B";
        } else {
            str4 = str6;
        }
        A0S.append(str4);
        if (this.A0B) {
            str5 = "D";
        } else {
            str5 = str6;
        }
        A0S.append(str5);
        if (this.A0C) {
            str6 = "P";
        }
        A0S.append(str6);
        return A0S.toString();
    }
}
