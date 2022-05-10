SHELL := /bin/bash

hello:
	@echo "hello world"


install:
	(\
		git lfs install; \
		mvn initialize; \
	)
