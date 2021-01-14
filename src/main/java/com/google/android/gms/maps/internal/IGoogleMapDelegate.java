package com.google.android.gms.maps.internal;

import X.AnonymousClass1Ab;
import X.AnonymousClass1BF;
import X.AnonymousClass1BG;
import X.AnonymousClass1BI;
import X.AnonymousClass1BL;
import X.AnonymousClass1BN;
import X.AnonymousClass1BO;
import X.AnonymousClass1BP;
import X.C36001lQ;
import X.C36011lR;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;

public interface IGoogleMapDelegate extends IInterface {
    AnonymousClass1Ab A1p(C36011lR v);

    void A1x(IObjectWrapper iObjectWrapper);

    void A1y(IObjectWrapper iObjectWrapper, AnonymousClass1BL v);

    void A1z(IObjectWrapper iObjectWrapper, int i, AnonymousClass1BL v);

    CameraPosition A59();

    IProjectionDelegate A8Z();

    IUiSettingsDelegate A9W();

    boolean ABd();

    void ACA(IObjectWrapper iObjectWrapper);

    void AN1();

    boolean AON(boolean z);

    void AOO(AnonymousClass1BN v);

    boolean AOT(C36001lQ v);

    void AOU(int i);

    void AOX(float f);

    void AOc(boolean z);

    void AOe(AnonymousClass1BO v);

    void AOf(AnonymousClass1BP v);

    void AOg(AnonymousClass1BF v);

    void AOi(AnonymousClass1BG v);

    void AOj(AnonymousClass1BI v);

    void AOl(int i, int i2, int i3, int i4);

    void APF(boolean z);

    void AQD();

    void clear();
}
