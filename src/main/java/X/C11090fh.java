package X;

import android.app.ProgressDialog;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.WebImagePicker;
import com.whatsapp.util.Log;

/* renamed from: X.0fh  reason: invalid class name and case insensitive filesystem */
public class C11090fh extends AnonymousClass0JW {
    public ProgressDialog A00;
    public final C27201Oo A01;
    public final /* synthetic */ WebImagePicker A02;

    public C11090fh(WebImagePicker webImagePicker, C27201Oo r2) {
        this.A02 = webImagePicker;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.setProgress(numArr[0].intValue());
        }
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        WebImagePicker webImagePicker = this.A02;
        ProgressDialog progressDialog = new ProgressDialog(webImagePicker);
        this.A00 = progressDialog;
        progressDialog.setProgressStyle(1);
        this.A00.setMessage(((AnonymousClass2C0) webImagePicker).A01.A06(R.string.photo_loading));
        this.A00.setCancelable(true);
        this.A00.setOnCancelListener(new AnonymousClass1KD(this));
        this.A00.show();
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A09 == this) {
            webImagePicker.A09 = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent intent = new Intent();
            intent.putExtra("webImageSource", this.A01.A06);
            webImagePicker.setResult(-1, intent);
            webImagePicker.finish();
        } else if (!super.A00.isCancelled()) {
            StringBuilder sb = new StringBuilder("webimage/download/error ");
            sb.append(number);
            Log.e(sb.toString());
            if (intValue == 2) {
                boolean A012 = AnonymousClass00C.A01();
                int i = R.string.insufficient_space_for_download_shared_storage;
                if (A012) {
                    i = R.string.insufficient_space_for_download;
                }
                webImagePicker.APo(i);
                return;
            }
            ((ActivityC004702f) webImagePicker).A0F.A0C(((AnonymousClass2C0) webImagePicker).A01.A06(R.string.error_load_image), 1);
        }
    }
}
