(ns user
  (:require [mount.core :as mount]
            hello-lti.core))

(defn start []
  (mount/start-without #'hello-lti.core/repl-server))

(defn stop []
  (mount/stop-except #'hello-lti.core/repl-server))

(defn restart []
  (stop)
  (start))


