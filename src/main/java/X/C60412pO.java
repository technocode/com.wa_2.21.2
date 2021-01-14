package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.2pO  reason: invalid class name and case insensitive filesystem */
public class C60412pO extends C59082n1 {
    public final ImageView A00;
    public final ImageView A01 = ((ImageView) findViewById(R.id.photo_new));
    public final ImageView A02 = ((ImageView) findViewById(R.id.photo_old));

    @Override // X.C59082n1
    public int getBackgroundResource() {
        return 0;
    }

    public C60412pO(Context context, C05390Oi r6) {
        super(context, r6);
        ImageView imageView = (ImageView) findViewById(R.id.arrow);
        this.A00 = imageView;
        imageView.setImageDrawable(new C06470Tj(this.A0n, C004302a.A03(context, R.drawable.ic_chat_icon_change_arrow)));
        A05();
    }

    private void A05() {
        ProfilePhotoChange profilePhotoChange;
        byte[] bArr;
        AbstractC14710ml r3;
        AbstractC14710ml r2;
        C05390Oi fMessage = getFMessage();
        if (!(!fMessage.A0n.A02 || fMessage.A00 != 6 || (profilePhotoChange = ((C12120ha) fMessage).A00) == null || (bArr = profilePhotoChange.newPhoto) == null || profilePhotoChange.oldPhoto == null)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            byte[] bArr2 = profilePhotoChange.oldPhoto;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            if (!(decodeByteArray == null || decodeByteArray2 == null)) {
                Resources resources = getContext().getResources();
                if (Build.VERSION.SDK_INT >= 21) {
                    r3 = new C30081ah(resources, decodeByteArray2);
                } else {
                    r3 = new C30091ai(resources, decodeByteArray2);
                }
                Resources resources2 = getContext().getResources();
                if (Build.VERSION.SDK_INT >= 21) {
                    r2 = new C30081ah(resources2, decodeByteArray);
                } else {
                    r2 = new C30091ai(resources2, decodeByteArray);
                }
                r3.A00();
                r2.A00();
                ImageView imageView = this.A02;
                imageView.setImageDrawable(r3);
                ImageView imageView2 = this.A01;
                imageView2.setImageDrawable(r2);
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                this.A00.setVisibility(0);
                return;
            }
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        this.A00.setVisibility(8);
    }

    @Override // X.C59082n1, X.AbstractC51572Zg
    public void A0K() {
        A05();
        super.A0K();
    }

    @Override // X.C59082n1, X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A05();
        }
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_photo_change;
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_photo_change;
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_photo_change;
    }
}
