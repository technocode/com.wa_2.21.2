package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.crop.CropImage;
import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.ColorPickerView;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;
import com.whatsapp.gallerypicker.GifPreviewFragment;
import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.gallerypicker.VideoPreviewFragment;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2bz  reason: invalid class name and case insensitive filesystem */
public class C52932bz {
    public final /* synthetic */ AnonymousClass2MF A00;

    public C52932bz(AnonymousClass2MF r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass2MF r3 = this.A00;
        if (r3.A04.A0G()) {
            C54212eX r1 = r3.A07;
            if (r1 instanceof C59772oG) {
                ImagePreviewFragment imagePreviewFragment = ((C59772oG) r1).A00;
                AnonymousClass2PX r12 = imagePreviewFragment.A00.A04;
                AnonymousClass2PV r4 = r12.A0M;
                if (r4 != null) {
                    r4.A00(r12.A00, r12.A03, (float) (r12.A0I.getWidth() >> 1), (float) (r12.A0I.getHeight() >> 1), 200);
                }
                if (imagePreviewFragment != null) {
                    Intent intent = new Intent(imagePreviewFragment.A0A(), CropImage.class);
                    AnonymousClass2PF r6 = (AnonymousClass2PF) imagePreviewFragment.A0A();
                    if (!((MediaPreviewFragment) imagePreviewFragment).A01.A04.A0U.A01.isEmpty()) {
                        try {
                            intent.putExtra("doodle", ((MediaPreviewFragment) imagePreviewFragment).A01.A04.getDoodle().A01());
                        } catch (JSONException e) {
                            Log.e("imagepreview/error-saving-doodle", e);
                        }
                    }
                    intent.putExtra("filter", ((MediaPreviewFragment) imagePreviewFragment).A02.A02);
                    intent.putExtra("scaleUpIfNeeded", false);
                    intent.putExtra("cropByOutputSize", false);
                    intent.putExtra("flattenRotation", false);
                    intent.putExtra("maxCrop", imagePreviewFragment.A04.A06(AbstractC000400g.A3F));
                    intent.putExtra("output", Uri.fromFile(ImagePreviewFragment.A00(imagePreviewFragment.A03, ((MediaPreviewFragment) imagePreviewFragment).A00)));
                    intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                    intent.setData(Uri.fromFile(r6.A6Q(((MediaPreviewFragment) imagePreviewFragment).A00)));
                    Rect A5c = r6.A5c(((MediaPreviewFragment) imagePreviewFragment).A00);
                    if (A5c != null) {
                        intent.putExtra("initialRect", A5c);
                    }
                    intent.putExtra("rotation", imagePreviewFragment.A0w());
                    if (((MediaPreviewFragment) imagePreviewFragment).A00.getQueryParameter("flip-h") != null) {
                        intent.putExtra("flipH", true);
                    }
                    imagePreviewFragment.A02 = true;
                    imagePreviewFragment.A0M(intent, 1, null);
                } else {
                    throw null;
                }
            }
            r3.A00();
            DoodleView doodleView = r3.A04;
            doodleView.A0Y = false;
            doodleView.A0R = null;
            r3.A04();
        }
    }

    public void A01() {
        Bitmap A03;
        float width;
        float height;
        long j;
        AnonymousClass2MF r5 = this.A00;
        if (r5.A04.A0G()) {
            r5.A07.A03();
            if (r5.A02.getVisibility() == 0) {
                r5.A00();
                return;
            }
            C48522Mp r2 = r5.A06;
            ColorPickerComponent colorPickerComponent = r5.A0D;
            ColorPickerView colorPickerView = colorPickerComponent.A06;
            r2.A02 = colorPickerView.A03;
            r2.A00 = (float) colorPickerView.A07;
            ((AbstractC16300pa) r2.A0X).A01.A00();
            C48522Mp r22 = r5.A06;
            r22.A0R.setText("");
            r22.A06("");
            r5.A02.setVisibility(0);
            TitleBarComponent titleBarComponent = r5.A0F;
            titleBarComponent.setToolbarExtraVisibility(0);
            colorPickerComponent.A04(true);
            r5.A04.A0Y = false;
            r5.A04();
            r5.A03();
            r5.A07.A01();
            titleBarComponent.A05(colorPickerView.A00, colorPickerView.A03);
            if (r5.A0I) {
                r5.A0A = r5.A08.A0v();
                MediaPreviewFragment mediaPreviewFragment = r5.A08;
                if (mediaPreviewFragment instanceof VideoPreviewFragment) {
                    VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) mediaPreviewFragment;
                    A03 = videoPreviewFragment.A0J.A03();
                    if (A03 == null) {
                        A03 = C002001d.A0V(videoPreviewFragment.A0K);
                    }
                } else if (!(mediaPreviewFragment instanceof ImagePreviewFragment)) {
                    A03 = ((GifPreviewFragment) mediaPreviewFragment).A00.A03();
                } else {
                    Bitmap photo = ((ImagePreviewFragment) mediaPreviewFragment).A01.getPhoto();
                    A03 = photo != null ? photo.copy(photo.getConfig(), true) : null;
                }
                if (A03 != null) {
                    Bitmap.Config config = A03.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    if ((config == config2 && A03.isMutable()) || (A03 = A03.copy(config2, true)) != null) {
                        DoodleView doodleView = r5.A04;
                        if (doodleView.A0M != null) {
                            Canvas canvas = new Canvas(A03);
                            if (doodleView.A0A % 180 == 90) {
                                width = doodleView.A0M.height();
                            } else {
                                width = doodleView.A0M.width();
                            }
                            if (doodleView.A0A % 180 == 90) {
                                height = doodleView.A0M.width();
                            } else {
                                height = doodleView.A0M.height();
                            }
                            canvas.scale(((float) A03.getWidth()) / width, ((float) A03.getHeight()) / height);
                            canvas.concat(doodleView.A0I);
                            RectF rectF = doodleView.A0M;
                            canvas.translate(-rectF.left, -rectF.top);
                            if (DoodleView.A01(doodleView.A0U.A02, doodleView.A0E)) {
                                canvas.save();
                                float f = 1.0f / ((float) doodleView.A09);
                                canvas.scale(f, f);
                                Bitmap bitmap = doodleView.A0E;
                                PointF pointF = doodleView.A0e;
                                canvas.drawBitmap(bitmap, pointF.x, pointF.y, doodleView.A0d);
                                canvas.restore();
                            }
                            for (AbstractC48582Mw r11 : doodleView.A0U.A02) {
                                if (!r11.A02) {
                                    boolean z = doodleView.A0V;
                                    if (z) {
                                        j = SystemClock.elapsedRealtime() - doodleView.A0C;
                                    } else {
                                        j = 0;
                                    }
                                    r11.A01 = j;
                                    if (r11 instanceof C59472nj) {
                                        ((C59472nj) r11).A0K(canvas, z);
                                    } else {
                                        r11.A09(canvas);
                                    }
                                }
                            }
                        }
                        C10590es r0 = r5.A03;
                        if (r0 != null) {
                            ((AnonymousClass0JW) r0).A00.cancel(true);
                        }
                        Rect rect = new Rect(0, 0, r5.A04.getMeasuredWidth(), r5.A04.getMeasuredHeight());
                        RectF rectF2 = r5.A04.A0f;
                        C10590es r23 = new C10590es(rect, new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom), r5.A0E);
                        r5.A03 = r23;
                        r5.A0H.ANC(r23, A03);
                    }
                }
            }
        }
    }
}
