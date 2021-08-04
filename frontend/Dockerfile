FROM node:15
WORKDIR /app
ADD package.json yarn.lock
RUN yarn install
COPY . .
CMD yarn serve