# KMPCommon

![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepo.repsy.io%2Fmvn%2Fuakihir0%2Fpublic%2Fwork%2Fsocialhub%2Fkhttpclient%2Fmaven-metadata.xml&link=https%3A%2F%2Frepo.repsy.io%2Fmvn%2Fuakihir0%2Fpublic%2Fwork%2Fsocialhub%2Fkhttpclient%2F)

![badge][badge-js]
![badge][badge-jvm]
![badge][badge-ios]
![badge][badge-mac]

**このライブラリは Kotlin Multiplatform で実装をする際に足りないライブラリの機能を補うためのものです。**
主に作者が必要なライブラリを詰め込んだもので、一般的に使われるものではないかもしれません。

## 機能

* **DateFormatter**
  * 日付のフォーマットを行うためのクラス
  * 依存: `kotlinx-datetime`
* **AnyMapper**
  * `Any` 型のデータをシリアライズできるようにするクラス
  * 依存: `kotlinx-serialization`
* **RunBlocking**
  * suspend 関数を KJS で blocking 関数に戻すクラス
    * **内部的に無限ループで完了を待機するため注意が必要**
  * 依存: `kotlinx-coroutines-core`

## ライセンス

MIT License

## 作者

[Akihiro Urushihara](https://github.com/uakihir0)


[badge-android]: http://img.shields.io/badge/-android-6EDB8D.svg
[badge-android-native]: http://img.shields.io/badge/support-[AndroidNative]-6EDB8D.svg
[badge-wearos]: http://img.shields.io/badge/-wearos-8ECDA0.svg
[badge-jvm]: http://img.shields.io/badge/-jvm-DB413D.svg
[badge-js]: http://img.shields.io/badge/-js-F8DB5D.svg
[badge-js-ir]: https://img.shields.io/badge/support-[IR]-AAC4E0.svg
[badge-nodejs]: https://img.shields.io/badge/-nodejs-68a063.svg
[badge-linux]: http://img.shields.io/badge/-linux-2D3F6C.svg
[badge-windows]: http://img.shields.io/badge/-windows-4D76CD.svg
[badge-wasm]: https://img.shields.io/badge/-wasm-624FE8.svg
[badge-apple-silicon]: http://img.shields.io/badge/support-[AppleSilicon]-43BBFF.svg
[badge-ios]: http://img.shields.io/badge/-ios-CDCDCD.svg
[badge-mac]: http://img.shields.io/badge/-macos-111111.svg
[badge-watchos]: http://img.shields.io/badge/-watchos-C0C0C0.svg
[badge-tvos]: http://img.shields.io/badge/-tvos-808080.svg