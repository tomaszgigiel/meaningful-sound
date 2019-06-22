(ns pl.tomaszgigiel.meaningful-sound.core
  (:require [clojure.string :as string])
  (:require [clojure.tools.logging :as log])
  (:require [pl.tomaszgigiel.meaningful-sound.cmd :as cmd])
  (:require [pl.tomaszgigiel.utils.misc :as misc])
  (:gen-class))

(defn -main [& args]
  "meaningful-sound: From files to sound and back in Clojure"
  (let [{:keys [uri options exit-message ok?]} (cmd/validate-args args)]
    (if exit-message
      (cmd/exit (if ok? 0 1) exit-message)
      (log/info "meaningful-sound")))
  (log/info "ok")
  (shutdown-agents))
