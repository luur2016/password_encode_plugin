package com.tangdong.td_password_encode_plugin;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** TdPasswordEncodePlugin */
public class TdPasswordEncodePlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "td_password_encode_plugin");
    channel.setMethodCallHandler(new TdPasswordEncodePlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPassword")) {
      String code = DesUtil2.encode(call.arguments().toString(),"yeejoin");
      result.success(code);
    } else {
      result.notImplemented();
    }
  }
}
