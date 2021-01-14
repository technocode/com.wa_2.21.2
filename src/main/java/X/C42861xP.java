package X;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.1xP  reason: invalid class name and case insensitive filesystem */
public class C42861xP implements AnonymousClass09O {
    public final AnonymousClass0GI A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass09H A02;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public C42861xP(AnonymousClass00S r1, AnonymousClass09H r2, AnonymousClass0GI r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r9) {
        if (C002001d.A0E(r9) == 404) {
            this.A00.A01(-1);
            return;
        }
        AnonymousClass0GI r5 = this.A00;
        int i = r5.A00().getInt("biz_block_reasons_api_back_off_days", 0);
        if (i == 0) {
            r5.A01(1);
            r5.A02(TimeUnit.DAYS.toMillis(1) + this.A01.A05());
        } else if (i > 0 && i < 16) {
            r5.A01(i << 1);
            r5.A02(TimeUnit.DAYS.toMillis((long) i) + r5.A00().getLong("biz_block_reasons_api_cooling_timestamp", 0));
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r13) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass0M5 A0D = r13.A0D("mobile_config");
        if (A0D != null) {
            AnonymousClass0M5 A0D2 = A0D.A0D("list");
            if (!(A0D2 == null || A0D2.A03 == null)) {
                AnonymousClass0OS A0A = A0D2.A0A("name");
                String str2 = null;
                if ("biz_block_reasons".equals(A0A != null ? A0A.A03 : null)) {
                    AnonymousClass0OS A0A2 = A0D2.A0A("v");
                    int A022 = C006803i.A02(A0A2 != null ? A0A2.A03 : null, 0);
                    AnonymousClass0OS A0A3 = A0D2.A0A("language");
                    String str3 = A0A3 != null ? A0A3.A03 : null;
                    if (A022 > 0 && str3 != null) {
                        for (AnonymousClass0M5 r6 : A0D2.A0H("item")) {
                            linkedHashMap.put(r6.A0G("id", null), AnonymousClass0M5.A00(r6.A01));
                        }
                        AnonymousClass0OS A0A4 = A0D2.A0A("country");
                        if (A0A4 != null) {
                            str2 = A0A4.A03;
                        }
                        if (!linkedHashMap.isEmpty()) {
                            AnonymousClass0GI r62 = this.A00;
                            r62.A00().edit().putInt("biz_block_reasons_version", A022).apply();
                            r62.A00().edit().putString("biz_block_reasons_language", str3).apply();
                            r62.A00().edit().putString("biz_block_reasons_country", str2).apply();
                            r62.A00().edit().putString("biz_block_reasons", new JSONObject(linkedHashMap).toString()).apply();
                        }
                    }
                }
            }
            AnonymousClass0GI r2 = this.A00;
            r2.A01(0);
            r2.A02(0);
        }
    }
}
