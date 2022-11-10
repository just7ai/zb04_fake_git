require: function.js

theme: /

    state: Start
        q!: $regex</start>
        a: Начнём. asdasdasd

    state: Hello
        intent!: /привет
        a: Привет  {{ getResult(number) }}

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

