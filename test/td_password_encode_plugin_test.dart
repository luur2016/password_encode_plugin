import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:td_password_encode_plugin/td_password_encode_plugin.dart';

void main() {
  const MethodChannel channel = MethodChannel('td_password_encode_plugin');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await TdPasswordEncodePlugin.getPasswordByPlugin("a1234567"), '42');
  });
}
