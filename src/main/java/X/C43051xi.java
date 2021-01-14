package X;

import android.text.method.LinkMovementMethod;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.regex.Pattern;

/* renamed from: X.1xi  reason: invalid class name and case insensitive filesystem */
public class C43051xi extends AbstractC25311Gi {
    public static C43051xi A00 = new C43051xi();
    public static final Pattern A01 = Pattern.compile("\\[(\\d+)]");

    public static void A00(TextEmojiLabel textEmojiLabel, AnonymousClass05q r3, C46552Az r4, Object obj) {
        if (obj != null) {
            AnonymousClass008.A0d(textEmojiLabel);
            textEmojiLabel.setText((CharSequence) obj);
        }
        Integer num = r4.A03;
        if (num != null) {
            textEmojiLabel.setGravity(num.intValue());
        }
        Float f = r4.A01;
        if (f != null) {
            textEmojiLabel.setLineHeight(f.intValue());
        }
        textEmojiLabel.setTag(R.id.on_text_clicked_listener, new C42991xc(r4, r3));
        textEmojiLabel.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
