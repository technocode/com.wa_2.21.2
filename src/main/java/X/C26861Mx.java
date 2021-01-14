package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1Mx  reason: invalid class name and case insensitive filesystem */
public class C26861Mx extends PrintDocumentAdapter {
    public Context A00;
    public PrintedPdfDocument A01;
    public final AnonymousClass05j A02;
    public final C02590Cr A03;
    public final String A04 = "join_whatsapp_group.pdf";
    public final String A05;

    public C26861Mx(Context context, C02590Cr r3, String str, AnonymousClass05j r5) {
        this.A00 = context;
        this.A03 = r3;
        this.A05 = str;
        this.A02 = r5;
    }

    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.A01 = new PrintedPdfDocument(this.A00, printAttributes2);
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
        } else {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A04).setContentType(0).setPageCount(1).build(), true);
        }
    }

    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PdfDocument.Page startPage = this.A01.startPage(0);
        Canvas canvas = startPage.getCanvas();
        TextView textView = new TextView(this.A00);
        textView.setTextColor(-16777216);
        textView.setTextSize(0, (float) (canvas.getWidth() / 25));
        textView.setGravity(1);
        textView.setText(C002001d.A1H(this.A05, this.A00, textView.getPaint(), this.A03));
        int width = canvas.getWidth() >> 3;
        textView.measure(View.MeasureSpec.makeMeasureSpec(canvas.getWidth() - (width << 1), 1073741824), View.MeasureSpec.makeMeasureSpec(canvas.getHeight(), EditorInfoCompat.IME_FLAG_FORCE_ASCII));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        canvas.translate((float) width, (float) (width >> 1));
        textView.draw(canvas);
        int i = -width;
        canvas.translate((float) i, (float) (i >> 1));
        AnonymousClass05j r7 = this.A02;
        int i2 = r7.A01;
        int i3 = r7.A00;
        int min = Math.min(canvas.getWidth(), canvas.getHeight() - textView.getMeasuredHeight());
        int i4 = min >> 3;
        int i5 = min - (i4 << 1);
        float f = (((float) i5) * 1.0f) / ((float) i2);
        canvas.translate((float) i4, (float) (textView.getMeasuredHeight() + i4));
        Paint paint = new Paint();
        paint.setColor(-16777216);
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (r7.A02[i7][i6] == 1) {
                    canvas.drawRect(f * ((float) i6), f * ((float) i7), f * ((float) (i6 + 1)), f * ((float) (i7 + 1)), paint);
                }
            }
        }
        int i8 = (i5 << 2) / 15;
        int i9 = (i5 - i8) >> 1;
        int i10 = i8 + i9;
        canvas.drawBitmap(BitmapFactory.decodeResource(this.A00.getResources(), R.drawable.ic_qr_walogo), (Rect) null, new Rect(i9, i9, i10, i10), (Paint) null);
        this.A01.finishPage(startPage);
        try {
            this.A01.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
            this.A01.close();
            this.A01 = null;
            writeResultCallback.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
        } catch (IOException e) {
            writeResultCallback.onWriteFailed(e.toString());
            this.A01.close();
            this.A01 = null;
        } catch (Throwable th) {
            this.A01.close();
            this.A01 = null;
            throw th;
        }
    }
}
