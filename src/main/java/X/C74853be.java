package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.registration.EULA;
import java.util.Locale;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
public class C74853be extends C05690Pr {
    public final /* synthetic */ EULA A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74853be(EULA eula, Context context, AnonymousClass02M r9, AnonymousClass03P r10, AbstractC02790Dl r11, String str, String str2) {
        super(context, r9, r10, r11, str);
        this.A00 = eula;
        this.A01 = str2;
    }

    @Override // X.AbstractC05700Ps, X.C05690Pr
    public void onClick(View view) {
        EULA eula = this.A00;
        String str = this.A01;
        if (eula != null) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, indexOf));
                sb.append("?lang=");
                Locale A0I = eula.A0B.A0I();
                String language = A0I.getLanguage();
                int hashCode = language.hashCode();
                if (hashCode != 3365) {
                    if (hashCode != 3374) {
                        if (hashCode != 3588) {
                            if (hashCode != 3704) {
                                if (hashCode == 3886 && language.equals("zh")) {
                                    language = "Hans".equals(AbstractC002201f.A02(A0I)) ? "zh_cn" : "zh_tw";
                                }
                            } else if (language.equals("tl")) {
                                language = "fil";
                            }
                        } else if (language.equals("pt")) {
                            language = C06600Tz.A00.contains(A0I.getCountry()) ? "pt_pt" : "pt_br";
                        }
                    } else if (language.equals("iw")) {
                        language = "he";
                    }
                } else if (language.equals("in")) {
                    language = "id";
                }
                sb.append(language);
                sb.append(str.substring(indexOf));
                str = sb.toString();
            }
            ((ActivityC004602e) eula).A04.A05(eula, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return;
        }
        throw null;
    }
}
