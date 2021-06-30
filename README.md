# Máscara Android

A ideia deste repositório surgiu durante a [Mentoria Santander Dev Mobile](https://www.youtube.com/watch?v=4HLpMue7eqg), quando foi levantada a questão do uso de string como entrada de dados (PF e PJ) do usuário e não um Int. Bom, há alguns motivos, como por exemplo o [intervalo de cada tipo](https://kotlinlang.org/docs/basic-types.html#integer-types). Mas mencionei, na ocasião, o uso de máscaras na formatação das strings e é o que venho demonstrar com esse repositório. Vale ressaltar que não existe validação nesta aplicação, apenas demonstração de uso, e que há outras maneiras de implementar essa funcionalidade e que talvez essa não seja a melhor mas é a que tenho utilizado e me está sendo muito útil.

Se curtiu ou se for útil, é só fazer um fork, clonar e se divertir!  

>Os créditos dessa máscara: [Wolmir Cezer Garbin](https://github.com/wolmirgarbin).

## Demonstração

![Utilização de Máscara de Texto](img/Mask-App.gif)

## Mapa da Aplicação

1. [Classe Mask Format](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/util/MaskFormatUtil.kt)
2. [Entrada de Dados Formatados ao Digitar](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/MainActivity.kt)
3. [Saída dos Dados Formatados](https://github.com/JefersonMelo/18-Mask/blob/master/app/src/main/java/com/jefmelo/mask/ActivityUnmasked.kt)
4. [Ativar Binding](https://github.com/JefersonMelo/18-Mask/blob/dc219cdc520b7b75cf38ab6fbec30bf53261c762/app/build.gradle#L33)

## Bibliografia

1. [Como Inserir Máscara](https://receitasdecodigo.com.br/android/como-inserir-mascara-em-um-edittext-no-android)
2. [Santander Bootcamp | Mobile Developer](https://web.digitalinnovation.one/track/santander-mobile-developer)
3. [1.Como Incorporar Vídeos Readme](https://qastack.com.br/programming/4279611/how-to-embed-a-video-into-github-readme-md)
4. [2.Como Incorporar Vídeos Readme](https://qastack.com.br/programming/11804820/how-can-i-embed-a-youtube-video-on-github-wiki-pages)
