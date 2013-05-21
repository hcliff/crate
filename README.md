# crate, dommy and dommy-crate

Crate is a ClojureScript implementation of the awesome [Hiccup](https://github.com/weavejester/hiccup/) html templating library.

Dommy is a ClojureScript DOM manipulation, templating and event library.

dommy-crate is a port of crates various element helpers for use with hiccup

## Requirements

dommy-crate is for use with dommy, but does not depend on crate

## Usage

```clojure
(ns myapp
 (:require [crate.form :as form])
 (:use-macros [dommy.macros :only [deftemplate]]))

(deftemplate item [r]
  [:div.view
    (form/check-box {:class "toggle"} "item" true)
    (form/label "item" "Awesome label")
    [:button.delete]])

=> <div class="view">
    <input name="item" type="checkbox" id="item" class="toggle" value="true">
    <label for="item">Awesome label</label>
    <button class="delete"></button>
   </div>

```

## Crate License

Copyright (C) 2011 Chris Granger

Distributed under the Eclipse Public License, the same as Clojure.

## dommy-crate License

Copyright (C) 2013 Henry Clifford

Distributed under the Eclipse Public License, the same as Clojure.