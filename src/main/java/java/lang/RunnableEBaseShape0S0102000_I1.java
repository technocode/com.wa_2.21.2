package java.lang;

import X.AbstractC663834a;
import X.AnonymousClass008;
import X.AnonymousClass374;
import X.AnonymousClass37B;
import X.AnonymousClass37H;
import X.AnonymousClass37I;
import X.AnonymousClass37K;
import X.AnonymousClass37L;
import X.AnonymousClass37M;
import X.C003701u;
import X.C54162eS;
import X.C72463Sy;
import X.C74263aS;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.text.ReadMoreTextView;

public class RunnableEBaseShape0S0102000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0102000_I1(ReadMoreTextView readMoreTextView) {
        this.A03 = 3;
        this.A02 = readMoreTextView;
    }

    public RunnableEBaseShape0S0102000_I1(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    public static void A00(RunnableEBaseShape0S0102000_I1 runnableEBaseShape0S0102000_I1) {
        AnonymousClass37I r0;
        StringBuilder A0S = AnonymousClass008.A0S("InlineYoutubeVideoPlayer - YoutubeJsInterface postPlayerEvent:");
        int i = runnableEBaseShape0S0102000_I1.A01;
        A0S.append(i);
        A0S.append(" data: ");
        int i2 = runnableEBaseShape0S0102000_I1.A00;
        AnonymousClass008.A1L(A0S, i2);
        boolean z = false;
        C72463Sy r3 = ((AnonymousClass37B) runnableEBaseShape0S0102000_I1.A02).A00;
        if (i != 0) {
            if (i == 1) {
                r3.A01 = i2 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            } else if (i == 2) {
                long j = (long) (i2 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                if (!r3.A07 && r3.A04 == -9223372036854775807L) {
                    r3.A04 = j;
                    r3.A09.loadUrl("javascript:(function() { loaded = true; })()");
                    long j2 = r3.A04;
                    if (j2 <= 0) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("Invalid duration=");
                        A0S2.append(j2);
                        r3.A0E(A0S2.toString(), false);
                    }
                }
            } else if (i != 3) {
                StringBuilder A0S3 = AnonymousClass008.A0S("Invalid postPlayerEvent");
                A0S3.append(i2);
                String obj = A0S3.toString();
                if (i2 == 0) {
                    z = true;
                }
                r3.A0E(obj, z);
            } else {
                StringBuilder A0S4 = AnonymousClass008.A0S("Youtube player Error=");
                A0S4.append(i2);
                String obj2 = A0S4.toString();
                if (i2 == 0) {
                    z = true;
                }
                r3.A0E(obj2, z);
            }
        } else if (r3 == null) {
            throw null;
        } else if ((i2 >= -1 && i2 <= 3) || i2 == 5) {
            AnonymousClass37L r02 = ((AnonymousClass37M) r3).A04;
            if (r02 != null) {
                r02.AIY(true, i2);
            }
            if (!(i2 != 0 || r3.A03 == i2 || (r0 = ((AnonymousClass37M) r3).A01) == null)) {
                r0.AEU(r3);
            }
            int i3 = r3.A02;
            if (i3 != 2 && i2 == 2) {
                r3.A05();
            } else if (i3 != 1 && i2 == 1) {
                r3.A09.loadUrl("javascript:(function() { player.playVideo(); })()");
                r3.A02 = 1;
                r3.A00 = 1;
                AnonymousClass374 r03 = r3.A0C;
                r03.A04();
                r03.A06 = true;
            }
            r3.A03 = i2;
            int i4 = r3.A00;
            if (i4 != 0 && (i4 != 1 ? i4 == 2 && i2 == 2 : i2 == 1)) {
                r3.A00 = 0;
                r3.A0C.A06 = false;
            }
            if (r3.A07 || i2 != 1) {
                if (i2 == 3) {
                    z = true;
                }
            } else if (r3.A04 == -9223372036854775807L) {
                r3.A0E("Video started playing before duration loaded.", true);
                return;
            } else {
                r3.A07 = true;
                AnonymousClass37K r04 = ((AnonymousClass37M) r3).A03;
                if (r04 != null) {
                    r04.AKK(r3);
                }
            }
            AnonymousClass37H r05 = ((AnonymousClass37M) r3).A00;
            if (r05 != null) {
                r05.ADa(r3, z);
            }
        }
    }

    public final void run() {
        int i;
        switch (this.A03) {
            case 0:
                ((C54162eS) this.A02).A03.A04(this.A00, this.A01);
                return;
            case 1:
                ((C54162eS) this.A02).A03.A06(this.A00, this.A01);
                return;
            case 2:
                EditText editText = (EditText) this.A02;
                int i2 = this.A00;
                int i3 = this.A01;
                if (editText.getText() != null) {
                    i = editText.getText().length();
                } else {
                    i = 0;
                }
                if (i2 <= i && i3 <= i) {
                    editText.setSelection(i2, i3);
                    return;
                }
                return;
            case 3:
                ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A02;
                if (readMoreTextView.A00 != 0 && !readMoreTextView.A05) {
                    int width = (readMoreTextView.getWidth() - readMoreTextView.getPaddingLeft()) - readMoreTextView.getPaddingRight();
                    int height = (readMoreTextView.getHeight() - readMoreTextView.getPaddingTop()) - readMoreTextView.getPaddingBottom();
                    if ((this.A01 != width || this.A00 != height) && readMoreTextView.getLayout() != null) {
                        this.A01 = width;
                        this.A00 = height;
                        CharSequence charSequence = readMoreTextView.A04;
                        AbstractC663834a r7 = ReadMoreTextView.A0C;
                        Layout A3N = r7.A3N(C003701u.A00(charSequence), readMoreTextView, width);
                        boolean z = false;
                        if (A3N.getLineCount() > readMoreTextView.A00) {
                            z = true;
                        }
                        readMoreTextView.A06 = z;
                        if (z) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readMoreTextView.A03);
                            spannableStringBuilder.setSpan(new C74263aS(this, readMoreTextView.getContext(), readMoreTextView.A01), 0, spannableStringBuilder.length(), 18);
                            if (readMoreTextView.A07) {
                                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
                            }
                            int lineCount = A3N.getLineCount();
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            for (int lineEnd = A3N.getLineEnd(readMoreTextView.A00 - 1); lineEnd > 0 && lineCount > readMoreTextView.A00; lineEnd--) {
                                spannableStringBuilder2 = new SpannableStringBuilder(readMoreTextView.A04.subSequence(0, lineEnd));
                                spannableStringBuilder2.append((CharSequence) "... ").append((CharSequence) spannableStringBuilder);
                                lineCount = r7.A3N(C003701u.A00(spannableStringBuilder2), readMoreTextView, width).getLineCount();
                            }
                            if (!TextUtils.equals(readMoreTextView.getText(), spannableStringBuilder2)) {
                                ReadMoreTextView.setVisibleText(readMoreTextView, spannableStringBuilder2);
                                return;
                            }
                            return;
                        } else if (!TextUtils.equals(readMoreTextView.getText(), readMoreTextView.A04)) {
                            ReadMoreTextView.setVisibleText(readMoreTextView, readMoreTextView.A04);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                A00(this);
                return;
            default:
                return;
        }
    }
}
