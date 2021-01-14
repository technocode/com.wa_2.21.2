package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.2Qh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC49392Qh implements DialogInterface.OnClickListener {
    public final /* synthetic */ GoogleSearchDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC49392Qh(GoogleSearchDialogFragment googleSearchDialogFragment) {
        this.A00 = googleSearchDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GoogleSearchDialogFragment googleSearchDialogFragment = this.A00;
        if (i == -1) {
            Bundle A03 = googleSearchDialogFragment.A03();
            ActivityC004902h A0B = googleSearchDialogFragment.A0B();
            if (!(A0B instanceof ActivityC004702f)) {
                AnonymousClass00E.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
            } else if (((ActivityC004702f) A0B).A0Q(R.string.quick_message_search_no_internet)) {
                return;
            }
            int i2 = A03.getInt("search_query_type");
            if (i2 == 0) {
                String string = googleSearchDialogFragment.A03().getString("search_query_text");
                int A06 = googleSearchDialogFragment.A01.A06(AbstractC000400g.A37);
                String str = "wa";
                if (A06 != 5) {
                    str = AnonymousClass008.A0F(str, A06);
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("www.google.com").path("search").appendQueryParameter("ctx", str);
                int length = (2000 - appendQueryParameter.build().toString().getBytes().length) - 3;
                Charset forName = Charset.forName("UTF-8");
                byte[] array = forName.encode(string).array();
                try {
                    String replace = URLEncoder.encode(string, "UTF-8").replace("+", "%20");
                    if (replace.getBytes().length > length) {
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length && i4 < array.length) {
                            if (replace.charAt(i3) != '%') {
                                i3++;
                                if (i3 > length) {
                                    break;
                                }
                            } else {
                                i3 += 3;
                                if (i3 > length) {
                                    break;
                                }
                            }
                            i4++;
                        }
                        while ((array[i4] & 192) == 128 && i4 > 0) {
                            i4--;
                        }
                        string = new String(Arrays.copyOfRange(array, 0, i4), forName);
                    } else if (string == null) {
                        AnonymousClass00E.A08(false, "Failed to encode URI in UTF-8, this should not happen");
                    }
                    Uri build = appendQueryParameter.appendQueryParameter("q", string).build();
                    if (build != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", build);
                        ActivityC004902h A0A = googleSearchDialogFragment.A0A();
                        if (A0A != null && !A0A.isFinishing()) {
                            googleSearchDialogFragment.A03.A0B(new AnonymousClass206(), null, false);
                            googleSearchDialogFragment.A00.A05(A0A, intent);
                            return;
                        }
                        return;
                    }
                } catch (UnsupportedEncodingException unused) {
                    Log.e("UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported");
                }
                AnonymousClass00E.A08(false, "Failed to encode URI in UTF-8, this should not happen");
            } else if (i2 == 1) {
                String string2 = googleSearchDialogFragment.A03().getString("image_file");
                ActivityC004902h A0A2 = googleSearchDialogFragment.A0A();
                if (A0A2 != null && !A0A2.isFinishing()) {
                    if (A0A2 instanceof ActivityC004702f) {
                        googleSearchDialogFragment.A04.ANC(new C10330eS((ActivityC004702f) A0A2, new File(string2)), new Void[0]);
                    } else {
                        AnonymousClass00E.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
                    }
                }
            }
        }
    }
}
