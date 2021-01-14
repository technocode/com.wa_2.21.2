package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Process;
import android.provider.ContactsContract;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.0hs  reason: invalid class name and case insensitive filesystem */
public final class C12300hs extends Thread {
    public final AnonymousClass02M A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass0ZR A02;
    public final AnonymousClass0HK A03;
    public volatile boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12300hs(AnonymousClass0ZR r5) {
        super("ContactPhotosThread");
        AnonymousClass02M A002 = AnonymousClass02M.A00();
        AnonymousClass01A A003 = AnonymousClass01A.A00();
        AnonymousClass01X.A00();
        AnonymousClass0HK A004 = AnonymousClass0HK.A00();
        this.A02 = r5;
        this.A00 = A002;
        this.A01 = A003;
        this.A03 = A004;
    }

    public final void A00(Bitmap bitmap, ImageView imageView, Object obj, AbstractC12270hp r12) {
        this.A00.A02.post(new RunnableEBaseShape0S0500000_I0(bitmap, imageView, r12, obj, this, 2));
    }

    public void run() {
        Bitmap decodeStream;
        Process.setThreadPriority(10);
        while (!this.A04) {
            try {
                Stack stack = this.A02.A00;
                if (stack.isEmpty()) {
                    synchronized (stack) {
                        stack.wait();
                    }
                }
                if (!this.A04) {
                    if (!stack.isEmpty()) {
                        synchronized (stack) {
                            if (!stack.isEmpty()) {
                                C12290hr r11 = (C12290hr) stack.pop();
                                if (r11 != null) {
                                    Object obj = r11.A01;
                                    if (obj instanceof C12310ht) {
                                        C12310ht r10 = (C12310ht) obj;
                                        ImageView imageView = r11.A04;
                                        Object obj2 = r11.A05;
                                        AbstractC12270hp r6 = r11.A00;
                                        int i = r11.A03;
                                        float f = r11.A02;
                                        if (imageView.getTag() != null && imageView.getTag().equals(obj2)) {
                                            int height = imageView.getHeight();
                                            if (height <= 0) {
                                                height = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.small_avatar_size);
                                            }
                                            long j = r10.A04;
                                            Iterator it = ((AbstractMap) AnonymousClass1Z4.A03(Long.valueOf(j).toString(), imageView.getContext())).values().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C007003k A09 = this.A01.A09((AnonymousClass02N) it.next());
                                                    if (A09 != null) {
                                                        r10.A01 = A09;
                                                        A00(this.A03.A02(A09, i, f, true), imageView, obj2, r6);
                                                        break;
                                                    }
                                                } else {
                                                    AnonymousClass0HK r12 = this.A03;
                                                    ContentResolver contentResolver = imageView.getContext().getContentResolver();
                                                    Bitmap bitmap = null;
                                                    if (r12 != null) {
                                                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j));
                                                        if (!(openContactPhotoInputStream == null || (decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream)) == null)) {
                                                            bitmap = C02230Bd.A0C(decodeStream, height, -1.0f);
                                                        }
                                                        r10.A00 = bitmap;
                                                        if (bitmap != null) {
                                                            A00(bitmap, imageView, obj2, r6);
                                                        }
                                                    } else {
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Object obj3 = r11.A01;
                                    if (obj3 instanceof C007003k) {
                                        A00(this.A03.A02((C007003k) obj3, r11.A03, r11.A02, true), r11.A04, r11.A05, r11.A00);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
