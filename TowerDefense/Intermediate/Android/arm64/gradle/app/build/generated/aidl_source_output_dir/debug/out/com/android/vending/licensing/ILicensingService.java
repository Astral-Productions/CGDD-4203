/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\NovaB\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\NovaB\AppData\Local\Android\Sdk\platforms\android-33\framework.aidl -oZ:\app\build\generated\aidl_source_output_dir\debug\out -IZ:\app\src\main\java -IZ:\app\src\debug\aidl -IC:\Users\NovaB\.gradle\caches\transforms-3\abedd8388bdbd55803e370bace33339f\transformed\media-1.0.0\aidl -IC:\Users\NovaB\.gradle\caches\transforms-3\87c712ceb280b89563e287f590257de7\transformed\core-1.3.0\aidl -IC:\Users\NovaB\.gradle\caches\transforms-3\7a1ff5a23d45e8270cb10429ea4d29f7\transformed\versionedparcelable-1.1.0\aidl -IZ:\downloader_library\build\intermediates\aidl_parcelable\debug\out -IZ:\permission_library\build\intermediates\aidl_parcelable\debug\out -dC:\Users\NovaB\AppData\Local\Temp\aidl4023905650580139178.d Z:\app\src\main\java\com\android\vending\licensing\ILicensingService.aidl
 */
package com.android.vending.licensing;
public interface ILicensingService extends android.os.IInterface
{
  /** Default implementation for ILicensingService. */
  public static class Default implements com.android.vending.licensing.ILicensingService
  {
    @Override public void checkLicense(long nonce, java.lang.String packageName, com.android.vending.licensing.ILicenseResultListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.vending.licensing.ILicensingService
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.vending.licensing.ILicensingService interface,
     * generating a proxy if needed.
     */
    public static com.android.vending.licensing.ILicensingService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.vending.licensing.ILicensingService))) {
        return ((com.android.vending.licensing.ILicensingService)iin);
      }
      return new com.android.vending.licensing.ILicensingService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_checkLicense:
        {
          long _arg0;
          _arg0 = data.readLong();
          java.lang.String _arg1;
          _arg1 = data.readString();
          com.android.vending.licensing.ILicenseResultListener _arg2;
          _arg2 = com.android.vending.licensing.ILicenseResultListener.Stub.asInterface(data.readStrongBinder());
          this.checkLicense(_arg0, _arg1, _arg2);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.android.vending.licensing.ILicensingService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void checkLicense(long nonce, java.lang.String packageName, com.android.vending.licensing.ILicenseResultListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(nonce);
          _data.writeString(packageName);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkLicense, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_checkLicense = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicensingService";
  public void checkLicense(long nonce, java.lang.String packageName, com.android.vending.licensing.ILicenseResultListener listener) throws android.os.RemoteException;
}