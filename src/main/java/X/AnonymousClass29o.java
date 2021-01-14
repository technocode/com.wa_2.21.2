package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.29o  reason: invalid class name */
public class AnonymousClass29o extends C05690Pr {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C06210Sf A01;
    public final /* synthetic */ boolean A02 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass29o(C06210Sf r8, Context context, AnonymousClass02M r10, AnonymousClass03P r11, AbstractC02790Dl r12, String str, Context context2) {
        super(context, r10, r11, r12, str);
        this.A01 = r8;
        this.A00 = context2;
    }

    @Override // X.AbstractC05700Ps, X.C05690Pr
    public void onClick(View view) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("wa-link-factory/click-link ");
        String str2 = this.A06;
        AnonymousClass008.A1U(A0S, str2);
        String str3 = (String) C06210Sf.A05.get(str2);
        if (str3 != null) {
            Uri parse = Uri.parse(str3);
            if (parse.getAuthority().contains("whatsapp")) {
                Uri.Builder buildUpon = parse.buildUpon();
                AnonymousClass01X r2 = this.A01.A03;
                buildUpon.appendQueryParameter("lg", r2.A04());
                buildUpon.appendQueryParameter("lc", r2.A03());
                if (this.A02) {
                    str = "1";
                } else {
                    str = "0";
                }
                buildUpon.appendQueryParameter("eea", str);
                parse = buildUpon.build();
            }
            StringBuilder sb = new StringBuilder("wa-link-factory/open-link ");
            sb.append(parse);
            Log.i(sb.toString());
            this.A01.A00.ANL(this.A00, parse);
        }
    }
}
