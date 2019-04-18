import 'dart:async';

import 'package:flutter/services.dart';

class TdPasswordEncodePlugin {
  static const MethodChannel _channel =
      const MethodChannel('td_password_encode_plugin');

  static Future<String> getPasswordByPlugin(String _password) async {
    final String password = await _channel.invokeMethod('getPassword',_password);
    return password;
  }
}
