[![Build Status](https://travis-ci.com/FRRe-DACS/weather.svg?branch=main)](https://travis-ci.com/FRRe-DACS/weather)

# Weather service

## Build

### Multi Stage Dockerfile

```console
docker build -t weather:1 .
```

### Single Stage Dockerfile

```console
docker build -t weather:1 -f single-stage.dockerfile .
```
