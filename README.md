# Máscara Android

A ideia deste repositório surgiu durante a [Mentoria Santander Dev Mobile](https://www.youtube.com/watch?v=4HLpMue7eqg), quando foi questionado o uso de string como entrada de dados (PF e PJ) do usuário e não um Int. Bom, há alguns motivos, como por exempo o [intervalo de cada tipo](https://kotlinlang.org/docs/basic-types.html#integer-types), mas mencionei o uso de máscaras na formatação das strings e é o que venho demonstrar com esse repositório. Vale ressaltar que não existe validação, apenas demonstração de uso e que há outras maneiras de implementar essa funcionalidade.

>Os créditos por essa máscara pertencem aos [Wolmir Cezer Garbin](https://github.com/wolmirgarbin).

## Demonstração

[![Little red riding hood](http://i.imgur.com/7YTMFQp.png)](https://vimeo.com/3514904 "Little red riding hood - Click to Watch!")

## Mapa da Aplicação

1. [Classe Mask Format](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/util/MaskFormatUtil.kt)
2. [Entrada de Dados Formatados ao Digitar](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/MainActivity.kt)
3. [Saída dos Dados Formatados](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/ActivityUnmasked.kt)
4. [Ativar Binding](https://github.com/JefersonMelo/18-Mask/blob/dc219cdc520b7b75cf38ab6fbec30bf53261c762/app/build.gradle#L33)

## Bibliografia

1. [Como Inserir Máscara](https://receitasdecodigo.com.br/android/como-inserir-mascara-em-um-edittext-no-android)
2. [Santander Bootcamp | Mobile Developer](https://web.digitalinnovation.one/track/santander-mobile-developer)
